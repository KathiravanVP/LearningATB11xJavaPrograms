package Tasks.JavaCodingQuestions_Part3;

import java.util.Scanner;

public class Task034_Type_of_Website_Based_on_Domain {
    private String url;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the site URL:");
        String siteURL = sc.next();
        String domainName = findDomain(siteURL);
        System.out.println("The website type is: "+domainName);
        sc.close();
    }

    public static String findDomain(String url){
        String siteDomain=null;
        if(url.endsWith("com"))
            siteDomain = "Commercial website";
        else if (url.endsWith("org"))
            siteDomain= "Non-profit organization";
        else if (url.endsWith("edu"))
            siteDomain= "Educational institution";
        else if (url.endsWith("gov"))
            siteDomain= "Government website";
        else if (url.endsWith("net"))
            siteDomain= "Network-related website";
        else if (url.endsWith("info"))
            siteDomain= "Informational website";
        else if (url.endsWith("xyz"))
            siteDomain= "Unknown or other types of websites";

        return siteDomain;
    }
}

