package com.codewars.kyu5;

import org.apache.commons.collections4.MultiMap;
import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.map.MultiValueMap;

import java.util.*;


public class WeightForWeight {


    public static String orderWeight(String strng) {

        if (strng.isEmpty()) {
            return "";
        }

        class WeightNumber implements Comparable{
            String initNum;
            Integer sumNum;
            WeightNumber (String initNum, Integer sumNum) {
                this.initNum = initNum;
                this.sumNum = sumNum;
            }
            @Override
            public String toString() {
                return initNum;
            }

            @Override
            public int compareTo(Object o) {
                WeightNumber anotherNum = (WeightNumber) o;
                int result = this.sumNum.compareTo(anotherNum.sumNum);

                if (result == 0) {
                    result = this.initNum.compareTo(anotherNum.initNum);
                }
                return result;
            }
        }

        char[] arr = strng.toCharArray();
        String[] strings = strng.split(" ");
        ArrayList<String> listInit = new ArrayList<>(Arrays.asList(strings));
        ArrayList<Integer> listSum = new ArrayList<>();
        ArrayList<WeightNumber> listWeightNum = new ArrayList<>();
        int currentSum = 0;

        for (int i = 0; i < arr.length; i++) {
            char currentChar = arr[i];
            if (currentChar == ' ' || i == arr.length - 1) {
                if (i == arr.length - 1) {
                    currentSum = currentSum + Integer.parseInt(String.valueOf(currentChar));
                }
                listSum.add(currentSum);
                currentSum = 0;
            } else {
                currentSum = currentSum + Integer.parseInt(String.valueOf(currentChar));
            }

        }

        for (int i = 0; i < listInit.size(); i++) {
            listWeightNum.add(new WeightNumber(listInit.get(i), listSum.get(i)));
        }

        StringBuilder sb = new StringBuilder();
        Collections.sort(listWeightNum);
        int counter = 0;
        for (WeightNumber wn : listWeightNum) {
            if (counter == listWeightNum.size() -1) {
                sb.append(wn);
                break;
            }
            sb.append(wn).append(" ");

            counter++;
        }


        return sb.toString();
    }


    public static void main(String[] args) {
        orderWeight("");
    }

}
