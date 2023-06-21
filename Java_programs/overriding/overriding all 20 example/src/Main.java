public class Main {
    public static void main(String[] args) {
        Cooking cook = new  Cooking();
        cook.chapati();
        cook.rice();
        cook.roti();

        //
        Ingrediants ingre = new Ingrediants();
      ingre.haldi();
      ingre.water();
      ingre.chapati();
      Flower flower=new Flower();
      flower.steam(10);
//fruit

        TypesOfFruit fruit=new  TypesOfFruit();
        fruit.apple();
        fruit.taste();

        //division
        Division division =new Division();
        division.div(14,7);
        Division division1 =new Division1();
        division1.div(7,14);
        //modulus
        Modulus modulus = new Modulus();
        modulus.div(7,14);
        Modulus1 modulus1 =new Modulus1();
        modulus1.div(7,14);
//multidiv
        Multidiv multidiv=new Multidiv();
        multidiv.div(14,12,10);
        Multidiv multidiv1=new Multidiv1();
        multidiv1.div(14,122,1);

        //perimeter
        Perimeter perimeter =new Perimeter1();
        perimeter.div(1,1);
        //perimeter of traingle

        Perimetereoftriangle perimetereoftriangle=new Perimetereoftriangle1();
        perimetereoftriangle.div(12,21,30);
        //subtraction

        Substraction substraction=new Substraction();
        substraction.sub(20,70);
        Substraction substraction1=new Substraction2();
        substraction1.sub(50,10);
        
        //person emplyee
        Person1 per =new Employee();

        per.showDetail();

    }
    }
