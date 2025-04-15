import java.util.Scanner;
class player{
    String name;

    public player(String n){
        name=n;
    }
}
class question extends player{
    Scanner inp=new Scanner(System.in);



    public question(String n) {
        super(n);
    }
    String MCQ1(){
        System.out.println("What is the capital of Denmark\n A.New Jersey B.Copenhegen C.Norway D.Delhi");
        String a=inp.next();
        return a;
    }
    String MCQ2(){
        System.out.println("What is the capital of China\n A.New Jersey B.Copenhegen C.Beijing D.Delhi");
        String a=inp.next();
        return a;
    }
    String MCQ3(){
        System.out.println("What is the capital of Belgium\n A.Brussels B.Copenhegen C.Norway D.Delhi");
        String a=inp.next();
        return a;
    }
}

class Evaluation extends question {
    String name;
    int score;
    String firstqn;
    String secondqn;
    String thirdqn;
    public Evaluation(String name,int score){
        super(name);
        this.score=score;
    }
    int eval(){
        firstqn=MCQ1();
        secondqn=MCQ2();
        thirdqn=MCQ3();
        if(firstqn.equalsIgnoreCase("B")){
            score++;

        }
        if(secondqn.equalsIgnoreCase("C")){
            score++;

        }
        if(thirdqn.equalsIgnoreCase("A")){
            score++;
        }


        return score;
    }

}
class quiz{
    public static void main(String[] args) {
        System.out.println("Welcome to my Quiz!! This is your quiz master Roy!! So Please enter your name!");
        Scanner inp=new Scanner(System.in);
        String name = inp.next();
        player player=new player(name);
        System.out.println("Hello "+name+" press 1 to begin or 2 to end");
        int n=inp.nextInt();
        int score=0;
        if(n==1){
            question one=new question(name);
            Evaluation eval=new Evaluation(name,score);
            score = eval.eval();

        }
        System.out.println("Congratulations You have scored "+score+"/3");
    }
}