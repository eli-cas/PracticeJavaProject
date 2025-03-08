/* 
//Understanding the concept of arguments of the main method
public class TestClass {
    public static void main(String[] args){
        System.out.println(args.length);
        for(int i=0; i<args.length; i++){
            System.out.println("args["+i+"] = \""+args[i]+"\"");
        } 
    }
}
 */

//Understanding the concept of arrays of arrays
public class TestClass { 
public static void main(String[] args) { 
    Object[] iaa[] = { {"string is also an object"}, {null} , {new Object() , Integer.valueOf(10)} }; 
    //nested loops used to print the contents of the array of arrays
    for(int i=0; i<iaa.length; i++){System.out.println("Element["+i+"] contains an array of length "+iaa[i].length); 
    for(int j = 0; j<iaa[i].length; j++){System.out.println("Element["+i+"]["+j+"] contains "+iaa[i][j]);} 
    }} 

    //Unsure why one is valid and the other is not. It has to do with the fact 
    //that the first one is a 1D array and the second one is a 2D array.
    Object[] oa = new int[2][3]; //this is valid.
    //Object[][] oaa = new int[2][3]; //this is not valid.

    Boolean[] ba = new Boolean[3];
    //print contents without initializing the elements expllicitly

}
