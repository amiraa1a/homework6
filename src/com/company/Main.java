package com.company;

public class Main {

    public static void main(String[] args) {
       Boss asiya = new Boss();
       asiya.setHealth(400);
       asiya.setDamage(60);
       asiya.setName("Asiya");
       asiya.weapon.setNameOfWeapon("лук");
        System.out.println("имя босса: " + asiya.getName() +" "+ "Урон босса: "+ asiya.getDamage() +" "+  " ХП босса: "+ asiya.getHealth() +" "+ " ОРужие босса:"+asiya.weapon.getNameOfWeapon());
    }
}
