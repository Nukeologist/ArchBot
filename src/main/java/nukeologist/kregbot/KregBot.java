package nukeologist.kregbot;

import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import nukeologist.kregbot.listeners.CommandListener;
import nukeologist.kregbot.listeners.GuildListener;
import nukeologist.kregbot.listeners.MessageListener;
import nukeologist.kregbot.listeners.ReadyListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.security.auth.login.LoginException;

/**
 * @author Nukeologist
 */
public enum KregBot {

    INSTANCE;

    private static final String version = "0.1";

    public static final Logger LOG = LoggerFactory.getLogger("[KregBot|Reborn]");

    private static JDA JDA;

    public void init(String[] args) throws LoginException {

        CommandListener.init();
        LOG.info("Finished initializing commands.");
        String token = System.getenv("BOT_TOKEN");
        if (token == null) {
            LOG.info("Didnt find the token in system env, trying inital args.");
            token = args[0];
        }
        JDA = new JDABuilder(AccountType.BOT)
                .setToken(token)
                .addEventListeners(new ReadyListener(), new MessageListener(), new CommandListener(), new GuildListener())
                .setActivity(Activity.playing("comunistas do helicóptero"))
                .build();
    }

    public String getVersion() {
        return version;
    }

    public JDA getJDA() {
        return JDA;
    }
}
