package kameleoon.springbootApp.dto;

import kameleoon.springbootApp.model.VoteType;

import java.util.Objects;

public class VoteDTO {
    private VoteType voteType;
    private Long id;

    public VoteType getVoteType() {
        return voteType;
    }

    public void setVoteType(VoteType voteType) {
        this.voteType = voteType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VoteDTO voteDTO = (VoteDTO) o;

        if (voteType != voteDTO.voteType) return false;
        return Objects.equals(id, voteDTO.id);
    }

    @Override
    public int hashCode() {
        int result = voteType != null ? voteType.hashCode() : 0;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "VoteDTO{" +
                "voteType=" + voteType +
                ", id=" + id +
                '}';
    }
}


