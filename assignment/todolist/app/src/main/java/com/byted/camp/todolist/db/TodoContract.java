package com.byted.camp.todolist.db;

import android.provider.BaseColumns;
/**
 * Created on 2019/1/22.
 *
 * @author xuyingyi@bytedance.com (Yingyi Xu)
 */
public final class TodoContract {

    // TODO 定义表结构和 SQL 语句常量

    private TodoContract() {
    }

    public static class Todolist implements BaseColumns{
        public static final String TABLE_NAME = "to_do_list";
        public static final String COLUNUM_LIST = "todo";
        public static final String COLUNUM_DATE = "date";
        public static final String COLUNUM_STATE = "state";

    }

    public static final String SQL_CREATE_TABLES =
            "CREATE TABLE " + Todolist.TABLE_NAME + " (" +
                    Todolist._ID + " INTEGER PRIMARY KEY," +
                    Todolist.COLUNUM_LIST + " TEXT," +
                    Todolist.COLUNUM_DATE + " LONG," +
                    Todolist.COLUNUM_STATE + " INTEGER)";

    public static final String SQL_DELETE_TABLES =
            "DROP TABLE IF EXISTS "+ Todolist.TABLE_NAME;

}
