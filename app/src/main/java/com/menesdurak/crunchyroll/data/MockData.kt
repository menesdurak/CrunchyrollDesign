package com.menesdurak.crunchyroll.data

import com.menesdurak.crunchyroll.data.entity.Anime
import com.menesdurak.crunchyroll.data.entity.Dub

object MockData {

    val animesForYou = listOf(
        Anime(id = 1, name = "Arknights: Prelude to Dawn", image = "arknights_prelude_to_dawn", dubbing = Dub.SUBTITLED),
        Anime(id = 3, name = "Dead Mount Death Play", image = "dead_mount_deathplay", dubbing = Dub.DUB_SUB),
        Anime(id = 9, name = "SENGOKU NIGHT BLOOD", image = "sengoku_night_blood", dubbing = Dub.SUBTITLED),
        Anime(id = 10, name = "The Ancient Magus' Bride", image = "the_ancient_magus_bride", dubbing = Dub.DUB_SUB),
        Anime(id = 11, name = "The Faraway Paladin", image = "the_faraway_paladin", dubbing = Dub.SUBTITLED),
        Anime(id = 12, name = "The Great Cleric", image = "the_great_cleric", dubbing = Dub.DUB_SUB),
        Anime(id = 14, name = "The Saint's Magic Power is Omnipotent", image = "the_saints_magic_power_is_omnipotent", dubbing = Dub.SUBTITLED),
        Anime(id = 15, name = "The World's Finest Assassin Gets Reincarnated in Another World as an Aristocrat", image = "the_worlds_finest_assassin", dubbing = Dub.DUB_SUB)
    )

    val animesMostPopular = listOf(
        Anime(id = 8, name = "One Piece", image = "one_piece", dubbing = Dub.DUB_SUB),
        Anime(id = 7, name = "JUJUTSU KAISEN", image = "jujutsu_kaisen", dubbing = Dub.DUB_SUB),
        Anime(id = 5, name = "Heavenly Delusion", image = "heavenly_delusion", dubbing = Dub.DUB_SUB),
        Anime(id = 13, name = "The Rising of the Shield Hero", image = "the_rising_of_the_shield_hero", dubbing = Dub.DUB_SUB),
        Anime(id = 4, name = "Dr. STONE", image = "dr_stone", dubbing = Dub.DUB_SUB),
        Anime(id = 6, name = "Hell's Paradise", image = "hells_paradise", dubbing = Dub.DUB_SUB),
        Anime(id = 16, name = "Zom 100: Bucket List of the Dead", image = "zom_100", dubbing = Dub.DUB_SUB),
        Anime(id = 2, name = "Claymore", image = "claymore", dubbing = Dub.DUB_SUB),
    )
}