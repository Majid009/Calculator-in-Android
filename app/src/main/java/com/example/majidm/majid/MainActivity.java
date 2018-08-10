package com.example.majidm.majid;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    TextView result_txt  , info_txt ;
    int number1 , number2 , answer;
    String temp="0" ;

    int operatorIndex = -1 ;  // default value
    char operator = 'X';     // default value


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result_txt = (TextView) findViewById(R.id.result_txt);
        info_txt = (TextView) findViewById(R.id.info_txt);
        number1=0 ; number2=0 ; answer=0 ;

        info_txt.setText(temp);

        //Toast.makeText(getApplicationContext(),"Hello world" , Toast.LENGTH_SHORT).show();
    }

    public void clear(View v){
         temp = "0";
         info_txt.setText(temp);
        result_txt.setText(temp);
    }

    public void one(View v){
          if(info_txt.getText().toString().equals("0")){
              temp = "1";
              info_txt.setText(temp);
          } else {
              temp += "1";
              info_txt.setText(temp);
          }
    }

    public void two(View v){
        if(info_txt.getText().toString().equals("0")){
            temp = "2";
            info_txt.setText(temp);
        } else {
            temp += "2";
            info_txt.setText(temp);
        }
    }

    public void three(View v){
        if(info_txt.getText().toString().equals("0")){
            temp = "3";
            info_txt.setText(temp);
        } else {
            temp += "3";
            info_txt.setText(temp);
        }
    }

    public void four(View v){
        if(info_txt.getText().toString().equals("0")){
            temp = "4";
            info_txt.setText(temp);
        } else {
            temp += "4";
            info_txt.setText(temp);
        }
    }

    public void five(View v){
        if(info_txt.getText().toString().equals("0")){
            temp = "5";
            info_txt.setText(temp);
        } else {
            temp += "5";
            info_txt.setText(temp);
        }
    }

    public void six(View v){
        if(info_txt.getText().toString().equals("0")){
            temp = "6";
            info_txt.setText(temp);
        } else {
            temp += "6";
            info_txt.setText(temp);
        }
    }

    public void seven(View v){
        if(info_txt.getText().toString().equals("0")){
            temp = "7";
            info_txt.setText(temp);
        } else {
            temp += "7";
            info_txt.setText(temp);
        }
    }

    public void eight(View v){
        if(info_txt.getText().toString().equals("0")){
            temp = "8";
            info_txt.setText(temp);
        } else {
            temp += "8";
            info_txt.setText(temp);
        }
    }

    public void nine(View v){
        if(info_txt.getText().toString().equals("0")){
            temp = "9";
            info_txt.setText(temp);
        } else {
            temp += "9";
            info_txt.setText(temp);
        }
    }

    public void zero(View v){
        if(info_txt.getText().toString().equals("0")){
            temp = "0";
            info_txt.setText(temp);
        } else {
            temp += "0";
            info_txt.setText(temp);
        }
    }

    public void add(View v){

        String x = info_txt.getText().toString();
        if( (x.contains("+")||x.contains("-")||x.contains("*")||x.contains("/") ) && !x.endsWith("+")){
            answer(v);
            //return;
        }

        if(!info_txt.getText().toString().equals("0")){
            if( !info_txt.getText().toString().endsWith("+") && !info_txt.getText().toString().endsWith("-")  && !info_txt.getText().toString().endsWith("*") && !info_txt.getText().toString().endsWith("/")){
                temp += "+";
                info_txt.setText(temp);
            }
        }

    }

    public void subtract(View v){

        String x = info_txt.getText().toString();
        if( (x.contains("+")||x.contains("-")||x.contains("*")||x.contains("/") ) && !x.endsWith("-")){
            answer(v);
            //return;
        }

        if(!info_txt.getText().toString().equals("0")){
            if( !info_txt.getText().toString().endsWith("+") && !info_txt.getText().toString().endsWith("-")  && !info_txt.getText().toString().endsWith("*") && !info_txt.getText().toString().endsWith("/")){
                temp += "-";
                info_txt.setText(temp);
            }
        }
    }

    public void mutliply(View v){

        String x = info_txt.getText().toString();
        if( (x.contains("+")||x.contains("-")||x.contains("*")||x.contains("/") ) && !x.endsWith("*")){
            answer(v);
            //return;
        }

        if(!info_txt.getText().toString().equals("0")){
            if( !info_txt.getText().toString().endsWith("+") && !info_txt.getText().toString().endsWith("-")  && !info_txt.getText().toString().endsWith("*") && !info_txt.getText().toString().endsWith("/")){
                temp += "*";
                info_txt.setText(temp);
            }
        }
    }

    public void divide(View v) {

        String x = info_txt.getText().toString();
        if( (x.contains("+")||x.contains("-")||x.contains("*")||x.contains("/") ) && !x.endsWith("/")){
            answer(v);
            //return;
        }

        if (!info_txt.getText().toString().equals("0")) {
            if (!info_txt.getText().toString().endsWith("+") && !info_txt.getText().toString().endsWith("-") && !info_txt.getText().toString().endsWith("*") && !info_txt.getText().toString().endsWith("/")) {
                temp += "/";
                info_txt.setText(temp);
            }
        }
    }

    public void answer(View v){


        String x = info_txt.getText().toString();

        operatorIndex = x.indexOf("+");
        if(operatorIndex!=-1){
           operator = x.charAt(operatorIndex);
        }

        if(operatorIndex==-1){
            operatorIndex = x.indexOf("-");
            if(operatorIndex!=-1){
                operator = x.charAt(operatorIndex);
            }
        }

        if(operatorIndex==-1){
            operatorIndex = x.indexOf("*");
            if(operatorIndex!=-1){
                operator = x.charAt(operatorIndex);
            }
        }

        if(operatorIndex==-1){
            operatorIndex = x.indexOf("/");
            if(operatorIndex!=-1){
                operator = x.charAt(operatorIndex);
            }
        }

        if(operator=='+'){
            number1 = Integer.parseInt(x.substring(0, operatorIndex));
            number2 = Integer.parseInt(x.substring(operatorIndex+1,x.length()));
            answer = number1 + number2 ;
            result_txt.setText(answer+"");

            temp = answer+"";
            info_txt.setText(temp);

        }

        if(operator=='-'){
            number1 = Integer.parseInt(x.substring(0, operatorIndex));
            number2 = Integer.parseInt(x.substring(operatorIndex+1,x.length()));
            answer = number1 - number2 ;
            result_txt.setText(answer+"");

            temp = answer+"";
            info_txt.setText(temp);

        }

        if(operator=='*'){
            number1 = Integer.parseInt(x.substring(0, operatorIndex));
            number2 = Integer.parseInt(x.substring(operatorIndex+1,x.length()));
            answer = number1 * number2 ;
            result_txt.setText(answer+"");

            temp = answer+"";
            info_txt.setText(temp);

        }

        if(operator=='/'){
            number1 = Integer.parseInt(x.substring(0, operatorIndex));
            number2 = Integer.parseInt(x.substring(operatorIndex+1,x.length()));
            answer = number1 / number2 ;
            result_txt.setText(answer+"");

            temp = answer+"";
            info_txt.setText(temp);
    }






    }
}
