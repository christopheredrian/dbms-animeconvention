/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.slu.dbms.group3.animeconvention.db.badgetype;

import java.util.List;
import javax.sql.DataSource;

/**
 *
 * @author chris
 */
public interface BadgeTypeDAO {

    /**
     * This is the method to be used to initialize database resources ie.
     * connection.
     *
     * @param ds
     */
    public void setDataSource(DataSource ds);

    /**
     * This is the method to be used to create a record in the BadgeType table.
     *
     * @param bean
     */
    public void create(BadgeType bean);

    /**
     * This is the method to be used to list down a record from the BadgeType
     * table corresponding to a passed EventId.
     *
     * @param badgeId
     * @return
     */
    public BadgeType getBadge(Integer badgeId);

    /**
     * This is the method to be used to list down all the records from the
     * BadgeType table.
     *
     * @return
     */
    public List<BadgeType> listBadgeTypes();

    /**
     * This is the method to be used to delete a record from the BadgeType table
     * corresponding to a passed student id.
     *
     * @param id
     */
    public void delete(Integer id);

    /**
     * This is the method to be used to update a record into the BadgeType
     * table.
     *
     * @param id
     * @param badgeDesc
     * @param amount
     * @param freebies
     */
    public void update(Integer id, String badgeDesc, double amount, String freebies);
}
