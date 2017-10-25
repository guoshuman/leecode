package com.guoshuman;


/** Student Attendance Record I 学生出勤记录之一
 You are given a string representing an attendance record for a student. The record only contains the following three characters:
 'A' : Absent.
 'L' : Late.
 'P' : Present.

 A student could be rewarded if his attendance record doesn't contain more than one 'A' (absent) or more than two continuous 'L' (late).
 You need to return whether the student could be rewarded according to his attendance record.

 Example 1:

 Input: "PPALLP"
 Output: True

 Example 2:

 Input: "PPALLL"
 Output: False
 */
public class StudentAttendance {
    public static void main(String[] args){
        System.out.println(Solution2("PPLALL"));
    }

    public static boolean Solution1(String s){
        char[] chrCharArray = s.toCharArray();
        int Absent = 0;
        int Late = 0;
        for(int i=0;i<chrCharArray.length;i++){
            if(String.valueOf(chrCharArray[i]).equals("A")){
                Absent++;
            }else if(String.valueOf(chrCharArray[i]).equals("L")){
                Late++;
            }else{
                Late = 0;
            }
            if(Late == 3 || Absent == 2){
                return false;
            }
        }
        return true;
    }

    /**
     * 利用正则判断字符串s中是否含有至少2个A
     */
    public static boolean Solution2(String s){
        if(s.matches(".*A.*A.*|.*LLL.*")){
            return false;
        }
        return true;
    }
}
