package com.innominds.aop.service;

/**
 * <b> Aspect:</b> checking privileges is an aspect <br>
 * <b> Advice: </b>isUserHasPrivileges is an advice <br>
 * <b> JoinPoints:</b>getMyMobileNumber , checkBalance <br>
 * <b> PointCut: </b>checkBalance
 *
 *
 */
public class LegacyAccountService {

    public String getMyMobileNumber() {

        return "900-211-0202";
    }

    public double checkBalance(String user) {

        if (!isUserHasPrivileges(user)) {
            throw new RuntimeException("Used is not having sufficint privileges to check balance ");
        }

        // write logic to read the balance from the database.

        return retrieveBalance();
    }

    boolean isUserHasPrivileges(String user) {
        // do some logic by hitting DB or something else

        return true;
    }

    double retrieveBalance() {

        // do some logic to retrieve balance
        return 2002.0;
    }
}
