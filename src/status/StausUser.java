package com.company;

public class StatusUser
{
    public void statusDetail(Code code)
    {
        switch(code)
        {
            case ZERO: System.out.println("REJECTED");
                break;
            case ONE: System.out.println("PENDING");
                break;
            case TWO:
                System.out.println("PROCESSING");
                break;
            case THREE:
                System.out.println("APPROVED");
                break;
            default:
                // This is not really needed
                System.out.println("NOT VALID CODE");
                break;
        }
    }

}
