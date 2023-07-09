package com.example.DeathCause;

import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;

import com.example.EntityName.EntityName;

import net.md_5.bungee.api.ChatColor;

public class DeathCause {
    public static String getDeathCause(EntityDamageEvent entityDamageEvent) {

        ChatColor colorWhite = ChatColor.WHITE;
        DamageCause damageCause = entityDamageEvent.getCause();

        if (damageCause == DamageCause.BLOCK_EXPLOSION) {
            return colorWhite + "был взорван";
        } else if (damageCause == DamageCause.CONTACT) {
            return colorWhite + "был заколот намертво";
        } else if (damageCause == DamageCause.CRAMMING) {
            return colorWhite + "столкнулся с большим количеством объектов";
        } else if (damageCause == DamageCause.CUSTOM) {
            return colorWhite + "был убит непонятно из-за чего";
        } else if (damageCause == DamageCause.DRAGON_BREATH) {
            return colorWhite + "был убит великим "
                    + EntityName.getEntityName(((EntityDamageByEntityEvent) entityDamageEvent).getDamager().getName());
        } else if (damageCause == DamageCause.DROWNING) {
            return colorWhite + "утонул";
        } else if (damageCause == DamageCause.DRYOUT) {
            return colorWhite + "умер из-за того, что не находился в воде";
        } else if (damageCause == DamageCause.ENTITY_ATTACK) {
            return colorWhite + "был убит "
                    + EntityName.getEntityName(((EntityDamageByEntityEvent) entityDamageEvent).getDamager().getName());
        } else if (damageCause == DamageCause.ENTITY_EXPLOSION) {
            return colorWhite + "был взорван "
                    + EntityName.getEntityName(((EntityDamageByEntityEvent) entityDamageEvent).getDamager().getName());
        } else if (damageCause == DamageCause.ENTITY_SWEEP_ATTACK) {
            return colorWhite + "был убит супер дюпер способом "
                    + EntityName.getEntityName(((EntityDamageByEntityEvent) entityDamageEvent).getDamager().getName());
        } else if (damageCause == DamageCause.FALL) {
            return colorWhite + "плюхнулся с высокой высоты";
        } else if (damageCause == DamageCause.FALLING_BLOCK) {
            return colorWhite + "получил по голове";
        } else if (damageCause == DamageCause.FIRE) {
            return colorWhite + "сгорел в огне";
        } else if (damageCause == DamageCause.FIRE_TICK) {
            return colorWhite + "умер из-за ожогов";
        } else if (damageCause == DamageCause.FLY_INTO_WALL) {
            return colorWhite + "влетел с большой скоростью в стену";
        } else if (damageCause == DamageCause.HOT_FLOOR) {
            return colorWhite + "расплавился на магме";
        } else if (damageCause == DamageCause.LAVA) {
            return colorWhite + "решим искупаться в лаве";
        } else if (damageCause == DamageCause.LIGHTNING) {
            return colorWhite + "получил мощный заряд энергии";
        } else if (damageCause == DamageCause.MAGIC) {
            return colorWhite + "добила магия";
        } else if (damageCause == DamageCause.MELTING) {
            return colorWhite + "умер из-за таяния снеговика";
        } else if (damageCause == DamageCause.POISON) {
            return colorWhite + "отравился и умер";
        } else if (damageCause == DamageCause.PROJECTILE) {
            return colorWhite + "получил в лицо снаряд";
        } else if (damageCause == DamageCause.STARVATION) {
            return colorWhite + "откинулся из-за лютой сушки, а надо было лишь поесть данар";
        } else if (damageCause == DamageCause.SUFFOCATION) {
            return colorWhite + "слился с объектом";
        } else if (damageCause == DamageCause.SUICIDE) {
            return colorWhite + "совершил харакири с честью";
        } else if (damageCause == DamageCause.THORNS) {
            return colorWhite + "шипы закололи насмерть";
        } else if (damageCause == DamageCause.VOID) {
            return colorWhite + "уууииииууу.... улетел в безну";
        } else if (damageCause == DamageCause.WITHER) {
            return colorWhite + "умер из-за эффекта увядания";
        }

        return colorWhite + "был убит непонятно из-за чего";
    }
}
