/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.exception;

/**
 *
 * @author SCXY
 */
public class CreateNewRatingException extends CreateNewEntityException {

    public CreateNewRatingException() {
        this("An exception happened when creating a new rating!");
    }

    public CreateNewRatingException(String msg) {
        super(msg);
    }
}
