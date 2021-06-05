package bongda.Entiy;

import javax.persistence.*;

@Entity
@Table(name = "team_use")
public class Team_UserEntity {
    @EmbeddedId
    team_userkey id;

    @ManyToOne(fetch = FetchType.EAGER)
    @MapsId("user_id")
    @JoinColumn(name = "user_id")
    UserEntity userEntity;


    @ManyToOne(fetch = FetchType.EAGER)
    @MapsId("team_id")
    @JoinColumn(name = "team_id")
    TeamEntity teamEntity;



    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "status_team_user")
    private Team_statusEntity status;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "role_id")
    private Role_teamEntity role_teamEntity;

    public Role_teamEntity getRole_teamEntity() {
        return role_teamEntity;
    }

    public void setRole_teamEntity(Role_teamEntity role_teamEntity) {
        this.role_teamEntity = role_teamEntity;
    }

    public Team_statusEntity getStatus() {
        return status;
    }

    public void setStatus(Team_statusEntity status) {
        this.status = status;
    }

    public team_userkey getId() {
        return id;
    }



    public void setId(team_userkey id) {
        this.id = id;
    }

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    public TeamEntity getTeamEntity() {
        return teamEntity;
    }

    public void setTeamEntity(TeamEntity teamEntity) {
        this.teamEntity = teamEntity;
    }

}
