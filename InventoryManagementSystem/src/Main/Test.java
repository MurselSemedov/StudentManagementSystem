/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import java.util.LinkedList;

/**
 *
 * @author 99470
 */
public class Test {
    public static void main(String[] args) {
        LinkedList<String> s=new LinkedList<>();
                LinkedList<Integer> v=new LinkedList<>();
s.add("cat");
s.add("lion");
s.add("dog");
s.add("tiger");
s.add("map");
s.add("fetch");
v.add(5);
v.add(1);
v.add(2);
v.add(3);
v.add(4);
v.add(6);
        System.out.println(Integer.valueOf(v.indexOf(s.add("cat"))));
    }
}
