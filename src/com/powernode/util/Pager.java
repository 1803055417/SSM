package com.powernode.util;

/**
 * @ProjectName: SSM007
 * @Package: com.powernode.util
 * @Description: 翻页
 * @Author: 倪云锋
 * @CreateDate: 2020/12/14 20:33
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
public class Pager {
    private  int no=1;//当前页号
    private  int pageNo=3;//每页记录数
    private  int skipNo=0;//起始行号（想要跳过的行数）
    private  int totalRowCount=0;//总计录数
    private  int totalPageNo=1;//总页号


    public  void  reCountSkipNo(){
        //下一次从几开始=（当前的页号-1）*每页的记录数  an=a1+（n-1）*d
        this.skipNo=(this.no-1)*this.pageNo;
    }
    public void reCountTotalPageNo() {//总页数=总记录数/每页记录数

        //51 / 10
        this.totalPageNo = (int) Math.ceil(this.totalRowCount * 1.0 / this.pageNo);
    }
    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
        //重新计算起始行号(欲跳过的行数)的值
        reCountSkipNo();
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
        reCountSkipNo();
    }

    public int getSkipNo() {
        return skipNo;
    }

    public void setSkipNo(int skipNo) {
        this.skipNo = skipNo;
    }

    public int getTotalRowCount() {
        return totalRowCount;
    }

    public void setTotalRowCount(int totalRowCount) {
        this.totalRowCount = totalRowCount;
        //重新计算总页数
        reCountTotalPageNo();
    }

    public int getTotalPageNo() {
        return totalPageNo;
    }

    public void setTotalPageNo(int totalPageNo) {
        this.totalPageNo = totalPageNo;
    }

}
