package com.yizhuo.learning.patterns.proxy.custom;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.Buffer;

/**
 * Created by yizhuo on 2018/5/6.
 */
public class MyclassLoader extends ClassLoader {

    private File classPathFile;

    public MyclassLoader() {
        String path = MyclassLoader.class.getResource("").getPath();
        this.classPathFile = new File(path);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        String className = MyclassLoader.class.getPackage().getName() + "." + name;
        if (classPathFile != null){
            File file = new File(classPathFile, name + ".class");
            if (file.exists()){
                FileInputStream in = null;
                ByteArrayOutputStream out = null;
                try {
                    in  = new FileInputStream(file);
                    out = new ByteArrayOutputStream();
                    byte[] bytes = new byte[1024];
                    int len;

                    while ((len = in.read(bytes)) != -1){
                        out.write(bytes,0,len);
                    }
                    return defineClass(className,out.toByteArray(),0,out.size());
                }catch (Exception e){
                    e.printStackTrace();
                }finally {
                    if (in != null){
                        try {
                            in.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (out != null) {
                        try {
                            out.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }

        return null;
    }
    
}
