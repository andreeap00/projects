#include <LiquidCrystal.h>
  
  #define PIR 2
  #define buzzer 3
  
  LiquidCrystal lcd(13, 12, 11, 10, 9, 8); // the LCD is connected to Arduino UNO board through pins: 13, 12, 11, 10, 9, 8 

  void setup() {
    Serial.begin(9600); //bits per second
    lcd.begin(16, 2); // 16 columns, 2 rows, the LCD type
    pinMode(buzzer, OUTPUT); // pin for the buzzer -> set output
    pinMode(PIR, INPUT); // pin for the PIR sensor
    
    pinMode(7, OUTPUT); // pin for the third LED
    pinMode(6, OUTPUT); // pin for the second LED
    pinMode(5, OUTPUT); // pin for the first LED 
  }
  
  void loop() {
    lcd.setCursor(3,0); // cursor set -> the third column, the first row
    lcd.print("No threat"); // message to be printed
    check_LCD_Buzzer();
    check_Lights();
  }

  void check_LCD_Buzzer()
  {
   boolean sensor = digitalRead(PIR); //in *sensor* the state of PIR is stored
    if(sensor == 1) // the case in which the sensor detects an intruder
     {
      digitalWrite(buzzer, HIGH); // the buzzer is on
      lcd.clear();
      lcd.setCursor(3,0);
      lcd.print("Threat"); // message to be displayed on the LCD
      lcd.setCursor(2,1);
      lcd.print("encountered");
      delay(1100);
      lcd.clear();
     }
    else
     {     
      digitalWrite(buzzer, LOW); // buzzer is off       
      }
     delay(10); // for a better performance of the simulator   
   }
	
  void check_Lights()
  {
   boolean sensor = digitalRead(PIR); 
    int led_Arr[] = { 5, 6, 7}; // the 3 LEDs are within the array
    if(sensor == 1) // the sensor detects an intruder
     {
      // the blue LEDs are turned off
      digitalWrite(led_Arr[0], LOW);
      delay(10);   
      digitalWrite(led_Arr[2], LOW);
      delay(10);
	  // the red LED is turned on, with flashing light
      int i;
   	  if(i = 1)
      {                             
       analogWrite(led_Arr[i], HIGH);
       delay(1500);
       analogWrite(led_Arr[i], LOW); 
       delay(100);
  	   }
	 }
    else
     {    
      // the blue LEDs are turned on
      digitalWrite(led_Arr[0], HIGH);
      delay(10); 
      digitalWrite(led_Arr[2], HIGH);
      delay(10); 
     }  
   }