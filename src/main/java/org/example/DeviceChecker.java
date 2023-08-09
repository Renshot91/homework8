package org.example;
//Представим, что у нас есть устройство, в котором две колбы.
//Прибор работает корректно, если температура первой колбы выше 100 градусов, а температура второй колбы меньше 100 градусов.
//Вы должны написать метод, который проверяет это устройство.
//Ваша программа должна иметь переменные temperature1 и temperature2.
//В результате метод возвращает true или false.
public class DeviceChecker {
        public static void main(String[] args) {
            double temperature1 = 105.0;
            double temperature2 = 95.0;

            boolean deviceStatus = checkDevice(temperature1, temperature2);
            System.out.println("Device status: " + deviceStatus);
        }

        public static boolean checkDevice(double temperature1, double temperature2) {
            boolean isDeviceWorking = false;

            if (temperature1 > 100.0 && temperature2 < 100.0) {
                isDeviceWorking = true;
            }

            return isDeviceWorking;
        }
    }

