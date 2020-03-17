package com.soft1851.spring.ioc.dao.Impl;

import com.soft1851.spring.ioc.dao.PostDao;
import com.soft1851.spring.ioc.entity.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

@Repository
public class PostDaoImpl implements PostDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int insert(Post post) {
        String sql ="INSERT INTO t_post VALUES (NULL,?,?,?,?,?)";
        Object[] args = {
                post.getForumId(),
                post.getTitle(),
                post.getContent(),
                post.getThumbnail(),
                post.getCreateTime()
        };
        return jdbcTemplate.update(sql,args);
    }

    @Override
    public int[] batchInsert(List<Post> posts) {
        final List<Post> postList = posts;
        String sql ="INSERT INTO t_post VALUES (NULL,?,?,?,?,?)";
        return jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement preparedStatement, int i) throws SQLException {
                preparedStatement.setInt(1,postList.get(i).getForumId());
                preparedStatement.setString(2,postList.get(i).getTitle());
                preparedStatement.setString(3,postList.get(i).getContent());
                preparedStatement.setBytes(4,postList.get(i).getThumbnail());
                preparedStatement.setTimestamp(5,postList.get(i).getCreateTime());
            }

            @Override
            public int getBatchSize() {
                return postList.size();
            }
        });
    }

    @Override
    public int[] batchDelete(List<Integer> postId) {
        final List<Integer> postIds = postId;
        String sql = "DELETE FROM t_post WHERE post_id = ? ";
        return jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement preparedStatement, int i) throws SQLException {
                preparedStatement.setInt(1,postIds.get(i));
            }

            @Override
            public int getBatchSize() {
                return postIds.size();
            }
        });
    }


    @Override
    public int delete(int postId) {
        String sql ="DELETE FROM t_post WHERE post_id = ? ";
        Object[] args = {postId};
        return jdbcTemplate.update(sql,args);
    }

    @Override
    public Post get(int postId) {
        String sql = "SELECT * FROM t_post WHERE post_id  =? ";
        Object[] args = {postId};
        return jdbcTemplate.queryForObject(sql,args,new BeanPropertyRowMapper<>(Post.class));
    }

    @Override
    public int count(int forumId) {
        String sql ="SELECT COUNT(*) FROM t_post WHERE forum_id="+forumId;
//        Object[] args = {forumId};
        return jdbcTemplate.queryForObject(sql,Integer.class);
    }
}
