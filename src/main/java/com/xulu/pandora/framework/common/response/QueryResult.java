package com.xulu.pandora.framework.common.response;

import java.util.List;

/**
 * @author xulu
 * @date 2018/8/2
 * @link https://github.com/xulu163
 */
public class QueryResult<T> {
    private String total;
    private List<T> rows;

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}