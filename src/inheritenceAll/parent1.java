package inheritenceAll;

public class parent1 {

    public void display (){
        System.out.println("parent1");
    }
}
//i need to use java 21
//child1 extends parent1 //single inhereiteance
//child1->child2 extends parent1 //multiple  java doesnt suppports means childclass can not be extends to parent1,parent2
//child1&&child2 extends parent1 //hierarchical inheritance

/*
multiple inheritance can lead the diamomd problem in diamond problem confusion areies if child inherits from 2
2 parents that have same same method
*/
