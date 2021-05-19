/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author phung
 */
public class Utility {
    public static long DiffenceDay(Date dhire, Date dpay)
    {

        // get mini giây
        Date startDate = dhire;
        Date endDate = dpay;
        long startTime = startDate.getTime();
        long endTime = endDate.getTime();
      
        long diffTime = endTime - startTime; // trừ
        long diffDays = diffTime / (1000 * 60 * 60 * 24); // tính ngày
        return diffDays;
    }

}
