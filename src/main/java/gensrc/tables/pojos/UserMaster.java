/*
 * This file is generated by jOOQ.
 */
package gensrc.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserMaster implements Serializable {

    private static final long serialVersionUID = 222217423;

    private Integer       userId;
    private String        firstName;
    private String        lastName;
    private String        userName;
    private String        password;
    private Boolean       isDeleted;
    private LocalDateTime createdOn;
    private LocalDateTime updatedOn;
    private Integer       roleId;

    public UserMaster() {}

    public UserMaster(UserMaster value) {
        this.userId = value.userId;
        this.firstName = value.firstName;
        this.lastName = value.lastName;
        this.userName = value.userName;
        this.password = value.password;
        this.isDeleted = value.isDeleted;
        this.createdOn = value.createdOn;
        this.updatedOn = value.updatedOn;
        this.roleId = value.roleId;
    }

    public UserMaster(
        Integer       userId,
        String        firstName,
        String        lastName,
        String        userName,
        String        password,
        Boolean       isDeleted,
        LocalDateTime createdOn,
        LocalDateTime updatedOn,
        Integer       roleId
    ) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.isDeleted = isDeleted;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
        this.roleId = roleId;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getIsDeleted() {
        return this.isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public LocalDateTime getCreatedOn() {
        return this.createdOn;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

    public LocalDateTime getUpdatedOn() {
        return this.updatedOn;
    }

    public void setUpdatedOn(LocalDateTime updatedOn) {
        this.updatedOn = updatedOn;
    }

    public Integer getRoleId() {
        return this.roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final UserMaster other = (UserMaster) obj;
        if (userId == null) {
            if (other.userId != null)
                return false;
        }
        else if (!userId.equals(other.userId))
            return false;
        if (firstName == null) {
            if (other.firstName != null)
                return false;
        }
        else if (!firstName.equals(other.firstName))
            return false;
        if (lastName == null) {
            if (other.lastName != null)
                return false;
        }
        else if (!lastName.equals(other.lastName))
            return false;
        if (userName == null) {
            if (other.userName != null)
                return false;
        }
        else if (!userName.equals(other.userName))
            return false;
        if (password == null) {
            if (other.password != null)
                return false;
        }
        else if (!password.equals(other.password))
            return false;
        if (isDeleted == null) {
            if (other.isDeleted != null)
                return false;
        }
        else if (!isDeleted.equals(other.isDeleted))
            return false;
        if (createdOn == null) {
            if (other.createdOn != null)
                return false;
        }
        else if (!createdOn.equals(other.createdOn))
            return false;
        if (updatedOn == null) {
            if (other.updatedOn != null)
                return false;
        }
        else if (!updatedOn.equals(other.updatedOn))
            return false;
        if (roleId == null) {
            if (other.roleId != null)
                return false;
        }
        else if (!roleId.equals(other.roleId))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.userId == null) ? 0 : this.userId.hashCode());
        result = prime * result + ((this.firstName == null) ? 0 : this.firstName.hashCode());
        result = prime * result + ((this.lastName == null) ? 0 : this.lastName.hashCode());
        result = prime * result + ((this.userName == null) ? 0 : this.userName.hashCode());
        result = prime * result + ((this.password == null) ? 0 : this.password.hashCode());
        result = prime * result + ((this.isDeleted == null) ? 0 : this.isDeleted.hashCode());
        result = prime * result + ((this.createdOn == null) ? 0 : this.createdOn.hashCode());
        result = prime * result + ((this.updatedOn == null) ? 0 : this.updatedOn.hashCode());
        result = prime * result + ((this.roleId == null) ? 0 : this.roleId.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("UserMaster (");

        sb.append(userId);
        sb.append(", ").append(firstName);
        sb.append(", ").append(lastName);
        sb.append(", ").append(userName);
        sb.append(", ").append(password);
        sb.append(", ").append(isDeleted);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(updatedOn);
        sb.append(", ").append(roleId);

        sb.append(")");
        return sb.toString();
    }
}
