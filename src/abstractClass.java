abstract class Collage {
    public abstract void Stdent();

    public abstract void Techar();

    public abstract void Worker();
}
    class HOD extends Collage{
        @Override
        public void Stdent() {
            System.out.println("Stdent Studes ");
        }

        @Override
        public void Techar() {
         System.out.println("Techar provided Knowalage");
        }

        @Override
        public void Worker() {
        System.out.println("Worker clean the collage ");
        }
    }
 class Den extends Collage{

     @Override
     public void Stdent() {
         System.out.println("The Student gane Knowalge");
     }

     @Override
     public void Techar() {
       System.out.println("The teacher providede best Knowlage");
     }

     @Override
     public void Worker() {
         System.out.println("Worker is clener");

     }
 }

class abstractClass{
    public static void main(String [] args){
        Collage V=new HOD();
        V.Stdent();
        V.Techar();
        V.Worker();
        Collage x=new Den();
        x.Stdent();
        x.Techar();
        x.Worker();


    }
}