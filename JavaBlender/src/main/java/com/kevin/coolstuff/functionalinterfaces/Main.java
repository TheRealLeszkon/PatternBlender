package com.kevin.coolstuff.functionalinterfaces;

public class Main {

    public static DamageStrategy burn(int duration){
        return (npc,damage) -> {
            try{
                for(int i=0;i<duration;i++){
                    npc.setHealth(npc.getHealth()-damage);
                    System.out.printf("%s |: burns! -%d HP\n",npc.getName(),damage);
                    Thread.sleep(3000);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException("Something went wrong with burn damage.");
            }
        };
    }

    public static DamageStrategy poison(int duration){

        return (npc,damage) ->{
            try{
                for(int i =0;i<duration;i++){
                    int turnDamage = (int) (damage*Math.pow(2,i));
                    npc.setHealth(npc.getHealth()- turnDamage);
                    System.out.printf("%s |: is hurt by the poison! -%d HP\n",npc.getName(),turnDamage);
                    Thread.sleep(3000);
                }
            } catch (Exception e) {
                throw new RuntimeException("Something went wrong with poison damage.");
            }
        };
    }

    public static void main(String[] args){
        NPC gregory = new NPC("gregory");
        DamageStrategy oneHit = (npc,damage) ->{
            npc.setHealth(npc.getHealth()-damage);
            System.out.printf("%s |: took some damage -%d HP\n",npc.getName(),damage);
            
        };
//        DamageStrategy burnDamage = burn(3);

        DamageStrategy poisonDamage = poison(3);
        oneHit.damage(gregory,30);
        System.out.println("--> Gregory's Health : "+gregory.getHealth());
        poisonDamage.damage(gregory,15);
//        burnDamage.damage(gregory,15);
        System.out.println("--> Gregory's Health : "+gregory.getHealth());

    }
}
