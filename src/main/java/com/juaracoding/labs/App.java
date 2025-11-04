package com.juaracoding.labs;


public class App {

  public static void main(String[] args) throws Exception {
    int today = 3;
    String task = "";

    /*
     * 1-5 : weekday
     * 6-7 : weekend
     */
    switch (today) {
      case 1:
          
          break;
      case 2:
          task = "Development";
          break;
      case 3:
          task = "QA Test";
          
          break;
      case 4:
          task = "QA Test";
          //System.out.println("Wednesday");
          break;
      case 5:
          task = "Deployment";
          //System.out.println("Thursday");
          break;
      case 6:
         
          break;
      case 7:
          
          break;
      default:
          task = "Invalid Task";
          break;
    }
    System.out.println(task);

    
  
    

  }
}