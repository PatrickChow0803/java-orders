package local.patrickchow0803.patrickchow0803.repositories;

import local.patrickchow0803.patrickchow0803.models.Agent;
import org.springframework.data.repository.CrudRepository;

public interface AgentRepo extends CrudRepository<Agent, Long> {
    Agent getByAgentcode(long agentcode);
}