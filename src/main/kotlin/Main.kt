import config.ConfigService
import eu.vendeli.tgbot.TelegramBot
import kotlinx.coroutines.runBlocking

const val COMMANDS_PACKAGE = "commands"
fun main() = runBlocking { // TODO instantiate coroutine scope properly

    val config = ConfigService().getConfigData()
    val bot = TelegramBot(token = config.botToken, commandsPackage = COMMANDS_PACKAGE)
}
