package modules

import resources.ResourceManager

class ResearchLab : OutpostModule(
    "Исследовательская лаборатория"
) {
    override fun performAction(manager: ResourceManager) {
        val minerals = manager.get("Minerals")
        if (minerals == null || minerals.amount < 30) {
            println("Недостаточно минералово для исследования")
            return
        }
        minerals.amount -= 30
        println("Лаборатория проводит исследование (минералы -30)")
    }
}