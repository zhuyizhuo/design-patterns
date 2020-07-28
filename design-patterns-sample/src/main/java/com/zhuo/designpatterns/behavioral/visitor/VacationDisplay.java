package com.zhuo.designpatterns.behavioral.visitor;


/*
The Design Patterns Java Companion

Copyright (C) 1998, by James W. Cooper

IBM Thomas J. Watson Research Center

*/

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Vector;

import javax.swing.AbstractListModel;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
/**
 * 使用Visitor模式的前提 
使用访问者模式是对象群结构中(Collection) 中的对象类型很少改变。

在两个接口Visitor和Visitable中,确保Visitable很少变化,也就是说，确保不能老有新的Element元素类型加进来，可以变化的是访问者行为或操作，也就是Visitor的不同子类可以有多种,这样使用访问者模式最方便.

如果对象集合中的对象集合经常有变化, 那么不但Visitor实现要变化，Visistable也要增加相应行为，GOF建议是,不如在这些对象类中直接逐个定义操作，无需使用访问者设计模式。

但是在Java中，Java的Reflect技术解决了这个问题，因此结合reflect反射机制，可以使得访问者模式适用范围更广了。

 * @author zhuo
 *
 */
public class VacationDisplay extends JFrame implements ActionListener {
  JawtList empList;

  JTextField total, btotal;

  JButton Vac;

  Employee[] employees;

  public VacationDisplay() {
    super("Vacation Display");
    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });

    JPanel jp = new JPanel();
    getContentPane().add(jp);
    jp.setLayout(new GridLayout(1, 2));
    empList = new JawtList(10);
    jp.add(empList);

    createEmployees();

    Box box = Box.createVerticalBox();
    jp.add(box);
    total = new JTextField(5);
    total.setHorizontalAlignment(JTextField.CENTER);
    box.add(total);
    box.add(Box.createVerticalStrut(10));
    btotal = new JTextField(5);
    btotal.setHorizontalAlignment(JTextField.CENTER);
    box.add(btotal);
    box.add(Box.createVerticalStrut(10));
    Vac = new JButton("Vacations");
    box.add(Vac);
    Vac.addActionListener(this);
    setSize(300, 200);
    setVisible(true);
    total.setText("  ");
    total.setBackground(Color.white);

  }

  public void createEmployees() {
    employees = new Employee[7];
    int i = 0;
    employees[i++] = new Employee("Susan Bear", 55000, 12, 1);
    employees[i++] = new Employee("Adam Gehr", 150000, 9, 0);
    employees[i++] = new Employee("Fred Harris", 50000, 15, 2);
    employees[i++] = new Employee("David Oakley", 57000, 12, 2);
    employees[i++] = new Employee("Larry Thomas", 100000, 20, 6);
    Boss b = new Boss("Leslie Susi", 175000, 16, 4);
    b.setBonusDays(12);
    Boss b1 = new Boss("Laurence Byerly", 35000, 17, 6);
    b1.setBonusDays(17);
    employees[i++] = b;
    employees[i++] = b1;

    for (i = 0; i < employees.length; i++) {
      empList.add(employees[i].getName());
    }
  }

  public void actionPerformed(ActionEvent e) {
    VacationVisitor vac = new VacationVisitor();
    bVacationVisitor bvac = new bVacationVisitor();
    for (int i = 0; i < employees.length; i++) {
      employees[i].accept(vac);
      employees[i].accept(bvac);
    }
    total.setText(new Integer(vac.getTotalDays()).toString());
    btotal.setText(new Integer(bvac.getTotalDays()).toString());
  }

  public static void main(String argv[]) {
    new VacationDisplay();
  }
}

class Employee {
  int sickDays, vacDays;

  float Salary;

  String Name;

  public Employee(String name, float salary, int vacdays, int sickdays) {
    vacDays = vacdays;
    sickDays = sickdays;
    Salary = salary;
    Name = name;
  }

  public String getName() {
    return Name;
  }

  public int getSickdays() {
    return sickDays;
  }

  public int getVacDays() {
    return vacDays;
  }

  public float getSalary() {
    return Salary;
  }

  public void accept(Visitor v) {
    v.visit(this);
  }
}

abstract class Visitor {
  public abstract void visit(Employee emp);

  public abstract void visit(Boss emp);
}

class Boss extends Employee {
  private int bonusDays;

  public Boss(String name, float salary, int vacdays, int sickdays) {
    super(name, salary, vacdays, sickdays);
  }

  public void setBonusDays(int bonus) {
    bonusDays = bonus;
  }

  public int getBonusDays() {
    return bonusDays;
  }

  public void accept(Visitor v) {
    v.visit(this);
  }
}

class VacationVisitor extends Visitor {
  protected int total_days;

  public VacationVisitor() {
    total_days = 0;
  }

  public void visit(Employee emp) {
    total_days += emp.getVacDays();
  }

  public void visit(Boss boss) {
    total_days += boss.getVacDays();
  }

  public int getTotalDays() {
    return total_days;
  }
}

class bVacationVisitor extends Visitor {
  int total_days;

  public bVacationVisitor() {
    total_days = 0;
  }

  public int getTotalDays() {
    return total_days;
  }

  public void visit(Boss boss) {
    total_days += boss.getVacDays();
    total_days += boss.getBonusDays();
  }

  public void visit(Employee emp) {
    total_days += emp.getVacDays();
  }
}
//this is a simple adapter class to
//convert List awt methods to Swing methods

class JawtList extends JScrollPane implements ListSelectionListener, awtList {
  private JList listWindow;

  private JListData listContents;

  public JawtList(int rows) {
    listContents = new JListData();
    listWindow = new JList(listContents);
    listWindow.setPrototypeCellValue("Abcdefg Hijkmnop");
    getViewport().add(listWindow);

  }

  public void add(String s) {
    listContents.addElement(s);
  }

  public void remove(String s) {
    listContents.removeElement(s);
  }

  public void clear() {
    listContents.clear();
  }

  public String[] getSelectedItems() {
    Object[] obj = listWindow.getSelectedValues();
    String[] s = new String[obj.length];
    for (int i = 0; i < obj.length; i++)
      s[i] = obj[i].toString();
    return s;
  }

  public void valueChanged(ListSelectionEvent e) {
  }

}

class JListData extends AbstractListModel {
  private Vector data;

  public JListData() {
    data = new Vector();
  }

  public int getSize() {
    return data.size();
  }

  public Object getElementAt(int index) {
    return data.elementAt(index);
  }

  public void addElement(String s) {
    data.addElement(s);
    fireIntervalAdded(this, data.size() - 1, data.size());
  }

  public void removeElement(String s) {
    data.removeElement(s);
    fireIntervalRemoved(this, 0, data.size());
  }

  public void clear() {
    int size = data.size();
    data = new Vector();
    fireIntervalRemoved(this, 0, size);
  }
}

interface awtList {
  public void add(String s);

  public void remove(String s);

  public String[] getSelectedItems();

}


