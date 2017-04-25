/*
package com.mycompany.myfirstapp.test;

import android.test.AndroidTestCase;
import android.util.Log;

import com.mycompany.myfirstapp.entity.Visitor;
import com.mycompany.myfirstapp.utils.VisitorRepo;

*
 * Created by Administrator on 2017/4/18.



public class VisitorTest extends AndroidTestCase{
    private VisitorRepo repo;

    @Override
    protected void setUp() throws Exception {
        repo = new VisitorRepo(getContext());
    }

    @Override
    protected void tearDown() throws Exception {
        repo.closeDB();
    }

    public void test() throws Exception {
        //mService.insert("haha", "123");            // VisitorRepo mSer///=new VisitorRepo(getContext());
        VisitorRepo visitorRepo = new VisitorRepo( getContext() );

        Visitor visitor = new Visitor();
        visitor.visitId = 1;
        visitor.createTime = "10000";
        visitor.changeBy = "123";
        visitor.crew = "xixi";
        visitor.visitTime = "1000992838";
        visitor.createBy = "lala";
        visitor.changeTime = "2673465858";
        visitor.department = "dududu";
        visitor.deskclrekPhone = "1378729972";
        visitor.memo = "xixiixix";
        visitor.reason = "sff";
        visitor.statusTime = "10809303";
        visitor.status = "hahaha";
        visitor.visitTime = "1983921389389";
        visitorRepo.insert( visitor );
        Log.d(LLLLLLLL ,"haolelelel++++++"+visitor );
    }
}
*/
