package Core_java;
import java.util.*;
public class Age_Calculator
{

    public static void main(String...x)
    {
        int a,b,c,d,e,f,mn=0,dn=0,yn=0,p,q;//mn-new month  dn-new date  yn-new year
        int r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11,r12;
        Scanner sc=new Scanner(System.in);

        for(int i=1;i<=1;i++)
        {
            System.out.println(" AGE CALCULATOR>>>>>>>>>>>>>>>>>>>>");
            System.out.printf("old date:");
            int do2=sc.nextInt();
            if(do2>32)
            {
                System.out.println("invalid date");
                break;
            }
            System.out.printf("old month:");
            int mo2=sc.nextInt();
            if(mo2>13)
            {
                System.out.println("invalid month");
                break;
            }
            System.out.printf("old year:");
            int yo2=sc.nextInt();
            switch(mo2)
            {
                case 1:
                    System.out.println("old month:-january:31");
                    break;
                case 2:
                    if(yo2%4==0)
                    {
                        System.out.println(" old month:-february:29");
                    }
                    else
                    {
                        System.out.println(" old month:-february:28");
                    }
                    break;
                case 3:
                    System.out.println("old month:-march:31");
                    break;
                case 4:
                    System.out.println("old month:-april:30");
                    break;
                case 5:
                    System.out.println("old month:-may:31");
                    break;
                case 6:
                    System.out.println("old month:-june:30");
                    break;
                case 7:
                    System.out.println("old month:-july:31");
                    break;
                case 8:
                    System.out.println("old month:-august:31");
                    break;
                case 9:
                    System.out.println("old month:-september:30");
                    break;
                case 10:
                    System.out.println("old month:-october:31");
                    break;
                case 11:
                    System.out.println("old month:-november:30");
                    break;
                case 12:
                    System.out.println("old month:-december:31");
                    break;
                default :
                    System.out.println(" you have enter invalid month");
                    break;
            }
            System.out.printf("current date:");
            int dc1=sc.nextInt();
            if(dc1>32)
            {
                System.out.println("invalid date");
                break;
            }
            System.out.printf("current month:");
            int mc1=sc.nextInt();
            if(mc1>13)
            {
                System.out.println("invalid month");
                break;
            }
            System.out.printf("current year:");
            int yc1=sc.nextInt();
            switch(mc1)
            {
                case 1:
                    r1=31;
                    System.out.println(" current month:-january");
                    System.out.println("Number of days in this month:"+r1);
                    break;
                case 2:
                    if(yc1%4==0)
                    {
                        r2=29;
                        System.out.println(" current month:-february");
                        System.out.println("Number of days in this month: "+r2);
                    }
                    else
                    {
                        r2=28;
                        System.out.println(" current month:-february");
                        System.out.println("Number of days in this month:%d "+r2);
                    }
                    break;
                case 3:
                    r3=31;
                    System.out.println("current month:-march");
                    System.out.println("Number of days in this month: "+r3);
                    break;
                case 4:
                    r4=30;
                    System.out.println("current month:-april");
                    System.out.println("Number of days in this month: "+r4);
                    break;
                case 5:
                    r5=31;
                    System.out.println("current month:-may");
                    System.out.println("Number of days in this month: "+r5);
                    break;
                case 6:
                    r6=30;
                    System.out.println("current month:-june");
                    System.out.println("Number of days in this month: "+r6);
                    break;
                case 7:
                    r7=31;
                    System.out.println("current month:-july");
                    System.out.println("Number of days in this month: "+r7);
                    break;
                case 8:
                    r8=31;
                    System.out.println("current month:-august");
                    System.out.println("Number of days in this month:"+r8);
                    break;
                case 9:
                    r9=30;
                    System.out.println("current month:-september");
                    System.out.println("Number of days in this month:"+r9);
                    break;
                case 10:
                    r10=31;
                    System.out.println("current month:-october");
                    System.out.println("Number of days in this month:"+r10);
                    break;
                case 11:
                    r11=30;
                    System.out.println("current month:-november");
                    System.out.println("Number of days in this month: "+r11);
                    break;
                case 12:
                    r12=31;
                    System.out.println("current month:-december");
                    System.out.println("Number of days in this month: "+r12);
                    break;
                default :
                    System.out.println(" you have enter invalid month");
                    break;
            }

            a=dc1;
            b=mc1;
            c=yc1;
            d=do2;
            e=mo2;
            f=yo2;
            if(mc1>0&&mc1<=12)
            {
                if(a>=d)
                {
                    p=b;
                    dn=a-d;
                }
                else
                {
                    switch(mc1)
                    {
                        case 1:
                            r1=31;
                            dn=a+r1-d;
                            break;
                        case 2:
                            if(yc1%4==0)
                            {
                                r2=29;
                                dn=a+r2-d;
                            }
                            else
                            {
                                r2=28;
                                dn=a+r2-d;
                            }
                            break;
                        case 3:
                            r3=31;
                            dn=a+r3-d;
                            break;
                        case 4:
                            r4=30;
                            dn=a+r4-d;
                            break;
                        case 5:
                            r5=31;
                            dn=a+r5-d;
                            break;
                        case 6:
                            r6=30;
                            dn=a+r6-d;
                            break;
                        case 7:
                            r7=31;
                            dn=a+r7-d;
                            break;
                        case 8:
                            r8=31;
                            dn=a+r8-d;
                            break;
                        case 9:
                            r9=30;
                            dn=a+r9-d;
                            break;
                        case 10:
                            r10=31;
                            dn=a+r10-d;
                            break;
                        case 11:
                            r11=30;
                            dn=a+r11-d;
                            break;
                        case 12:
                            r12=31;
                            dn=a+r12-d;
                            break;
                    }
                    p=--b;
                }
            }
            else
            {
                break;
            }
            if(p>=e)
            {
                q=c;
                mn=p-e;
            }
            else
            {
                q=--c;
                mn=p+12-e;
            }
            if(c>=f)
            {
                yn=c-f;
            }
            System.out.println("Year:"+yn+" , "+"Month:"+mn+" , "+"Day:"+dn+" ");
            int total_month;
            total_month=12*yn+mn;
            System.out.println("total month:"+total_month+","+"days:"+dn);
            if(yn>18)
            {
                System.out.println("you are adult and abled to give vote as per your choice");
            }
            else if(yn<=18)
            {
                System.out.println("you are not adult and  not abled to give vote as per your choice");
            }
        }
        int option;
        System.out.println("\n\n\n\n 1.money interest.\n 2.age calculator .\n");
        System.out.println("Enter your choice:");
        option=sc.nextInt();
        switch (option)
        {
            case 1:
                double rate,principle,total$_month,interest;
                System.out.println("Enter rate:");
                rate=sc.nextDouble();
                System.out.println("Enter principle:");
                principle=sc.nextDouble();
                total$_month=12*yn+mn;
                interest=(rate*principle*total$_month)/100;
                System.out.println("total interest of given principle :"+interest);
                System.out.println("total amount:"+(principle+interest));
                break;
                case 2:
                    break;
                    default:
                        System.out.println("You have entered an invalid option");
                        break;
        }



    }
}




