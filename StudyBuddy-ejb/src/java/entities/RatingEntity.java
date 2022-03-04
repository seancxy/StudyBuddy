/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author wenting
 */
@Entity
public class RatingEntity implements Serializable {


    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ratingId;
        
    @Column(scale = 1, precision = 2)
    private Double rating;
    
    //should description be optional?
    @Column(nullable = false)
    @NotNull
    @Size(min = 1)
    private String ratingDescription;

    @JoinColumn(nullable = false)
    @ManyToOne(optional = false)
    private AccountEntity ratee;
    
    @JoinColumn(nullable = false)
    @ManyToOne(optional = false)
    private AccountEntity rater;

        
    public RatingEntity() {
        rating = Double.valueOf(0);
    }
    
    public RatingEntity(Double rating, String ratingDescription) {
        this();
        this.rating = rating;
        this.ratingDescription = ratingDescription;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public String getRatingDescription() {
        return ratingDescription;
    }

    /**
     * @param ratingDescription the ratingDescription to set
     */
    public void setRatingDescription(String ratingDescription) {
        this.ratingDescription = ratingDescription;
    }

    /**
     * @return the ratee
     */
    public AccountEntity getRatee() {
        return ratee;
    }

    /**
     * @param ratee the ratee to set
     */
    public void setRatee(AccountEntity ratee) {
        this.ratee = ratee;
    }

    /**
     * @return the rater
     */
    public AccountEntity getRater() {
        return rater;
    }

    /**
     * @param rater the rater to set
     */
    public void setRater(AccountEntity rater) {
        this.rater = rater;
    }

    /**
     * @return the ratingId
     */
    public Long getRatingId() {
        return ratingId;
    }

    /**
     * @param ratingId the ratingId to set
     */
    public void setRatingId(Long ratingId) {
        this.ratingId = ratingId;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ratingId != null ? ratingId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RatingEntity)) {
            return false;
        }
        RatingEntity other = (RatingEntity) object;
        if ((this.ratingId == null && other.ratingId != null) || (this.ratingId != null && !this.ratingId.equals(other.ratingId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.RatingEntity[ ratingId=" + ratingId + " ]";
    }

    public Long getratingId() {
        return ratingId;
    }

    public void setratingId(Long ratingId) {
        this.ratingId = ratingId;
    }
    
}
