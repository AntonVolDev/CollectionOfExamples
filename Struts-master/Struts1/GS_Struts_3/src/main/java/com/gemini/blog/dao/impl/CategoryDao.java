package com.gemini.blog.dao.impl;

import com.gemini.blog.dao.AbstractDao;
import com.gemini.blog.model.Category;
import com.gemini.blog.model.Post;
import com.gemini.blog.util.DatabaseUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Author: Georgy Gobozov
 * Date: 21.04.13
 */
public class CategoryDao extends AbstractDaoImpl<Category> {


    @Override
    public void fillCreateStatement(PreparedStatement pstmt, Category entity) {
        try {
            pstmt.setString(1, entity.getName());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void fillEditStatement(PreparedStatement pstmt, Category entity) {
        try {
            pstmt.setString(1, entity.getName());
            pstmt.setInt(2, entity.getId());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Category getEntity(ResultSet resultSet) {
        try {
            return new Category(resultSet.getInt("id"), resultSet.getString("name"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String getCreateQuery() {
        return dbUtil.getQuery("create.category");
    }

    @Override
    public String getDeleteQuery() {
        return dbUtil.getQuery("delete.category");
    }

    @Override
    public String getEditQuery() {
        return dbUtil.getQuery("update.category");
    }

    @Override
    public String getGetByIdQuery() {
        return dbUtil.getQuery("get.category.by.id");
    }

    @Override
    public String getGetAllQuery() {
        return dbUtil.getQuery("get.all.categories");
    }
}
