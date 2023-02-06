package config

import helpers.getEnvVar
import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.mockkStatic
import io.mockk.unmockkStatic

class ConfigServiceSpec : BehaviorSpec({

    val staticMockList = "helpers.SystemHelpersKt"
    beforeSpec {
        mockkStatic(staticMockList)
    }

    afterSpec {
        unmockkStatic(staticMockList)
    }

    given("BOT_TOKEN environment variable is set") {
        val token = "bot token"
        every { getEnvVar("BOT_TOKEN") } returns token

        `when`("getting the config") {
            then("botToken should be set") {
                ConfigService().getConfigData().botToken shouldBe token
            }
        }
    }
})
