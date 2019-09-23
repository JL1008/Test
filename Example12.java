interface Animal{
int ID=1;
void breathe();
void run();
}
interface LandAnimal extends Animal{
void LiveOnland();
}
class Dog implements LandAnimal{
public void breathe(){
System.out.println("douzaihuxi");

}
public void run(){
System.out.println("gouzaipao");
}
public void LiveOnland(){
System.out.println("goushenghuozailudi");}}
public class Example12{
public static void main(String args[]){
Dog dog=new Dog();
dog.breathe();
dog.run();
dog.LiveOnland();}}