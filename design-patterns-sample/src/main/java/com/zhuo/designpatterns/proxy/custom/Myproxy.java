package com.zhuo.designpatterns.proxy.custom;

import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

/**
 * Created by yizhuo on 2018/5/6.
 */
@SuppressWarnings("restriction")
public class Myproxy {

    private static String ln = "\r\n";

	public static Object getInstance(MyclassLoader loader,
                                     Class<?>[] interfaces,
                                     MyInvocationHandler h) {
        try {
            //用代码生成代码
            String classFile = generateSrc(interfaces);

            //文件输出到磁盘
            String filePath = Myproxy.class.getResource("").getPath();
            System.out.println(filePath);
            File f = new File(filePath + "$Proxy.java");
            FileWriter fw = new FileWriter(f);
            fw.write(classFile);
            fw.flush();
            fw.close();

            //用代码编译代码
            JavaCompiler systemJavaCompiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager standardFileManager = systemJavaCompiler.getStandardFileManager(null, null, null);
            Iterable<? extends JavaFileObject> javaFileObjects = standardFileManager.getJavaFileObjects(f);
            JavaCompiler.CompilationTask task = systemJavaCompiler.getTask(null, standardFileManager, null, null, null, javaFileObjects);
            task.call();
            standardFileManager.close();

            //用代码加载代码
            Class<?> proxyClass = loader.findClass("$Proxy");
            Constructor<?> constructor = proxyClass.getConstructor(MyInvocationHandler.class);
            f.delete();
            File file = new File(filePath + "$Proxy.class");
            if (file.exists())file.delete();

            //用代码运行代码
            return constructor.newInstance(h);

        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    private static String generateSrc(Class<?>[] interfaces) {

        StringBuffer sb = new StringBuffer();

        sb.append("package com.zhuo.design.com.zhuo.design.patterns.proxy.custom;" + ln);
        sb.append("import " + interfaces[0].getName() +";" + ln);
        sb.append("import java.lang.reflect.Method;"+ ln);
        sb.append("public class $Proxy implements " + interfaces[0].getName() + "{" + ln);
        sb.append(" MyInvocationHandler h;" + ln);

        sb.append("public $Proxy(MyInvocationHandler h){" + ln);
        sb.append("this.h = h;" + ln);
        sb.append("}" + ln);

        for (Method m : interfaces[0].getMethods()){
            sb.append(" public " + m.getReturnType().getName() + " " + m.getName() + "(){"+ln);
            sb.append("try{" + ln);
            sb.append("Method m = " + interfaces[0].getName() + ".class.getMethod(\"" + m.getName() + "\",new Class[]{});" + ln);
            sb.append("this.h.invoke(this,m,null);" + ln);
            sb.append("} catch (Throwable e) {" + ln);
            sb.append("e.printStackTrace();" + ln);
            sb.append("}" + ln);

            sb.append("}");
        }

        sb.append("}" + ln);

        return sb.toString();
    }
}
