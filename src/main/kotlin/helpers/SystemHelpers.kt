package helpers

fun getEnvVar(varName: String): String {
    return System.getenv(varName)
}
