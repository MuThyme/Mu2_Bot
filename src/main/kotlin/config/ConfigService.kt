package config

import helpers.getEnvVar

class ConfigService {
    fun getConfigData(): ConfigData {
        return ConfigData(
            botToken = getEnvVar("BOT_TOKEN")
        )
    }
}
