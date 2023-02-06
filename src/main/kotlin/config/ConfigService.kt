package config

class ConfigService {
    fun getConfigData(): ConfigData {
        return ConfigData(
            botToken = System.getenv("BOT_TOKEN")
        )
    }
}
