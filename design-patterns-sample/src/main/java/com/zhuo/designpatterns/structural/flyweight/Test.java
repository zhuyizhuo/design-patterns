package com.zhuo.designpatterns.structural.flyweight;

import java.util.Hashtable;

/**
 * 动机(Motivate):
 * 采用纯粹对象方案的问题在于大量细粒度的对象会很快充斥在系统中，从而带来很高的运行时代价--------主要指内存需求方面的代价。
 * 如何在避免大量细粒度对象问题的同时，让外部客户程序仍然能够透明地使用面向对象的方式来进行操作？ 意图(Intent):
 * 运用共享技术有效地支持大量细粒度的对象。 -------《设计模式》GOF
 * 
 * 
 * 适用性： 当以下所有的条件都满足时，可以考虑使用享元模式： 1、 一个系统有大量的对象。 2、 这些对象耗费大量的内存。
 * 3、这些对象的状态中的大部分都可以外部化。 4、这些对象可以按照内蕴状态分成很多的组，当把外蕴对象从对象中剔除时，每一个组都可以仅用一个对象代替。
 * 5、软件系统不依赖于这些对象的身份，换言之，这些对象可以是不可分辨的。
 * 满足以上的这些条件的系统可以使用享元对象。最后，使用享元模式需要维护一个记录了系统已有的所有享元的表
 * ，而这需要耗费资源。因此，应当在有足够多的享元实例可供共享时才值得使用享元模式。
 * 
 * 
 * Flyweight更多时候的时候一种底层的设计模式，在我们的实际应用程序中使用的并不是很多。String类型其实就是运用了Flyweight模式。可以想象
 * ，如果每次执行string s1 = “abcd”操作，都创建一个新的字符串对象的话，内存的开销会很大。所以如果第一次创建了这样的一个字符串对象s1
 * ，下次再创建相同的字符串s2时只是把它的引用指向“abcd”，这样就实现了“abcd”在内存中的共享。
 * 
 * Flyweight实现要点： 1．面向对象很好的解决了抽象性的问题，但是作为一个运行在机器中的程序实体，我们需要考虑对象的代价问题。
 * Flyweight设计模式主要解决面向对象的代价问题，一般不触及面向对象的抽象性问题。
 * 2．Flyweight采用对象共享的做法来降低系统中对象的个数，从而降低细粒度对象给系统带来的内存压力。在具体实现方面，要注意对象状态的处理。
 * 3．享元模式的优点在于它大幅度地降低内存中对象的数量
 * 。但是，它做到这一点所付出的代价也是很高的：享元模式使得系统更加复杂。为了使对象可以共享，需要将一些状态外部化
 * ，这使得程序的逻辑复杂化。另外它将享元对象的状态外部化，而读取外部状态使得运行时间稍微变长。
 * 
 * @author zhuo
 */
  // "Flyweight"
  abstract class Character
  {
    protected char symbol;
    protected int width;
    protected int height;
    protected int ascent;
    protected int descent;
    protected int pointSize;

    public abstract void Display(int pointSize);
  }

  // "ConcreteFlyweight"

  class CharacterA extends Character
  {
    // Constructor
    public CharacterA()
    {
      this.symbol = 'A';
      this.height = 100;
      this.width = 120;
      this.ascent = 70;
      this.descent = 0;
    }

    public  void Display(int pointSize)
    {
      this.pointSize = pointSize;
     System.out.println(this.symbol +
        " (pointsize " + this.pointSize + ")");
    }
  }

  // "ConcreteFlyweight"

  class CharacterB extends Character
  {
    // Constructor
    public CharacterB()
    {
      this.symbol = 'B';
      this.height = 100;
      this.width = 140;
      this.ascent = 72;
      this.descent = 0;
    }

    public  void Display(int pointSize)
    {
      this.pointSize = pointSize;
     System.out.println(this.symbol +
        " (pointsize " + this.pointSize + ")");
    }

  }

  //  C, D, E, etc.

  // "ConcreteFlyweight"

  class CharacterZ extends Character
  {
    // Constructor
    public CharacterZ()
    {
      this.symbol = 'Z';
      this.height = 100;
      this.width = 100;
      this.ascent = 68;
      this.descent = 0;
    }

    public  void Display(int pointSize)
    {
      this.pointSize = pointSize;
      System.out.println(this.symbol +
        " (pointsize " + this.pointSize + ")");
    }
  }
  // "FlyweightFactory"

  class CharacterFactory
  {
    private Hashtable characters = new Hashtable();

    public Character GetCharacter(char key)
    {
      // Uses "lazy initialization"
      Character character = (Character)characters.get(key);
      if (character == null)
      {
        switch (key)
        {
          case 'A': character = new CharacterA(); break;
          case 'B': character = new CharacterB(); break;
            //
          case 'Z': character = new CharacterZ(); break;
        }
        characters.put(key, character);
      }
      return character;
    }
  }
// test application
  public class Test
  {
    public static void main(String []args)
    {
      // Build a document with text
      String document = "AAZZBBZB";
      char[] chars = document.toCharArray();

      CharacterFactory f = new CharacterFactory();

      // extrinsic state
      int pointSize = 10;

      // For each character use a flyweight object
      for(char c : chars)
      {
        pointSize++;
        Character character = f.GetCharacter(c);
        character.Display(pointSize);
      }


    }
  }

