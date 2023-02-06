package handlers.commands

import eu.vendeli.tgbot.TelegramBot
import eu.vendeli.tgbot.annotations.CommandHandler
import eu.vendeli.tgbot.annotations.UnprocessedHandler
import eu.vendeli.tgbot.api.message
import eu.vendeli.tgbot.types.User

class DirectMessageHandlers {
    @CommandHandler(["/start"])
    suspend fun start(user: User, bot: TelegramBot) {
        message { "Hello, this is Mü2" }.send(user, bot)
    }

    @UnprocessedHandler
    suspend fun unhandledUpdates(user: User, bot: TelegramBot) {
        message { "Sorry, I don't know what you mean" }.send(user, bot)
    }
}
