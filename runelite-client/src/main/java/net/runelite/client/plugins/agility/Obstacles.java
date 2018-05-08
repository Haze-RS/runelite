/*
 * Copyright (c) 2018, SomeoneWithAnInternetConnection
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.agility;

import com.google.common.collect.Sets;
import java.util.Set;
import static net.runelite.api.ObjectID.*;

public class Obstacles
{
	public static final Set<Integer> COURSE_OBSTACLE_IDS = Sets.newHashSet(
		// Gnome
		OBSTACLE_NET_23134, TREE_BRANCH_23559, TREE_BRANCH_23560, OBSTACLE_NET_23135, OBSTACLE_PIPE_23138,
		OBSTACLE_PIPE_23139, LOG_BALANCE_23145, BALANCING_ROPE_23557,
		// Brimhaven
		PLANK_3572, PLANK_3571, PLANK_3570, ROPE_SWING, PILLAR_3578, LOW_WALL, LOG_BALANCE, LOG_BALANCE_3557,
		BALANCING_LEDGE_3561, BALANCING_LEDGE, MONKEY_BARS_3564, BALANCING_ROPE, HAND_HOLDS_3583,
		// Draynor
		ROUGH_WALL, TIGHTROPE, TIGHTROPE_10075, NARROW_WALL, WALL_10084, GAP_10085, CRATE_10086,
		// Al-Kharid
		ROUGH_WALL_10093, TIGHTROPE_10284, CABLE, ZIP_LINE, TROPICAL_TREE_10357, ROOF_TOP_BEAMS,
		TIGHTROPE_10583, GAP_10352,
		// Pyramid
		STAIRS_10857, LOW_WALL_10865, LEDGE_10860, PLANK_10868, GAP_10882, LEDGE_10886, STAIRS_10857, GAP_10884,
		GAP_10859, GAP_10861, LOW_WALL_10865, GAP_10859, LEDGE_10888, PLANK_10868, CLIMBING_ROCKS_10851, DOORWAY_10855,
		// Varrock
		ROUGH_WALL_10586, CLOTHES_LINE, GAP_10642, WALL_10777, GAP_10778, GAP_10779, GAP_10780, LEDGE_10781, EDGE,
		// Penguin
		STEPPING_STONE_21120, STEPPING_STONE_21126, STEPPING_STONE_21128, STEPPING_STONE_21129,
		STEPPING_STONE_21130, STEPPING_STONE_21131, STEPPING_STONE_21132, STEPPING_STONE_21133,
		ICICLES, ICE, ICE_21149, ICE_21150, ICE_21151, ICE_21152, ICE_21153, ICE_21154, ICE_21155, ICE_21156,
		// Barbarian
		ROPESWING_23131, LOG_BALANCE_23144, OBSTACLE_NET_20211, BALANCING_LEDGE_23547, LADDER_16682, CRUMBLING_WALL_1948,
		// Canifis
		TALL_TREE_10819, GAP_10820, GAP_10821, GAP_10828, GAP_10822, POLEVAULT, GAP_10823, GAP_10832,
		// Ape atoll
		STEPPING_STONE_15412, TROPICAL_TREE_15414, MONKEYBARS_15417, SKULL_SLOPE_15483, ROPE_15487, TROPICAL_TREE_16062,
		// Falador
		ROUGH_WALL_10833, TIGHTROPE_10834, HAND_HOLDS_10836, GAP_11161, GAP_11360, TIGHTROPE_11361,
		TIGHTROPE_11364, GAP_11365, LEDGE_11366, LEDGE_11367, LEDGE_11368, LEDGE_11370, EDGE_11371,
		// Wilderness
		OBSTACLE_PIPE_23137, ROPESWING_23132, STEPPING_STONE_23556, LOG_BALANCE_23542, ROCKS_23640,
		// Seers
		WALL_11373, GAP_11374, TIGHTROPE_11378, GAP_11375, GAP_11376, EDGE_11377,
		// Dorgesh-Kaan
		CABLE_22569, CABLE_22572, LADDER_22564, JUTTING_WALL_22552, TUNNEL_22557, PYLON_22664,
		CONSOLE, STAIRS_22650, STAIRS_22651, STAIRS_22609, STAIRS_22608,
		// Pollniveach
		BASKET_11380, MARKET_STALL_11381, BANNER_11382, GAP_11383, TREE_11384, ROUGH_WALL_11385,
		MONKEYBARS, TREE_11389, DRYING_LINE,
		// Rellaka
		ROUGH_WALL_11391, GAP_11392, TIGHTROPE_11393, GAP_11395, GAP_11396, TIGHTROPE_11397, PILE_OF_FISH,
		// Ardougne
		GAP_11406, GAP_11429, GAP_11430, STEEP_ROOF, GAP_11630, PLANK_11631, WOODEN_BEAMS
	);

	public static final Set<Integer> SHORTCUT_OBSTACLE_IDS = Sets.newHashSet(
		// Grand Exchange
		UNDERWALL_TUNNEL_16529, UNDERWALL_TUNNEL_16530,
		// South Varrock
		STEPPING_STONE_16533, FENCE_16518, ROCKS_16549, ROCKS_16550,
		// Falador
		WALL_17049, CRUMBLING_WALL_24222, UNDERWALL_TUNNEL, UNDERWALL_TUNNEL_16528, CREVICE_16543,
		// Draynor
		UNDERWALL_TUNNEL_19032, UNDERWALL_TUNNEL_19036,
		// South Lumbridge
		BROKEN_RAFT, STEPPING_STONE_16513,
		// Trollheim
		ROCKS_3803, ROCKS_3804, ROCKS_16523, ROCKS_16524, ROCKS_3748, ROCKS_16545, ROCKS_16521, ROCKS_16522,
		ROCKS_16464,
		// North Camelot
		LOG_BALANCE_16540, LOG_BALANCE_16541, LOG_BALANCE_16542,
		// Rellekka
		BROKEN_FENCE,
		// Ardougne
		LOG_BALANCE_16546, LOG_BALANCE_16547, LOG_BALANCE_16548,
		// Yanille
		CASTLE_WALL, HOLE_16520, WALL_17047,
		// Observatory
		PUPPET_ARMS,
		// Gnome Stronghold
		ROCKS_16534, ROCKS_16535,
		// Karamja Volcano
		STRONG_TREE_17074,
		// Shilo Village
		STEPPING_STONE_16466,
		// Vine east of Shilo Village
		NULL_26884, NULL_26886,
		// Stepping stones east of Shilo Village (does not work)
		NULL_23465, NULL_23466, NULL_23467,
		// Middle of Karamja
		A_WOODEN_LOG,
		// Slayer Tower
		SPIKEY_CHAIN, SPIKEY_CHAIN_16538,
		// Fremennik Slayer Cave
		STRANGE_FLOOR_16544, CREVICE_16539,
		// Wilderness
		STEPPING_STONE_14918, STEPPING_STONE_14917, ROCKY_HANDHOLDS_26404, ROCKY_HANDHOLDS_26405, ROCKY_HANDHOLDS_26406,
		// Seers' Village Coal Mine
		LOG_BALANCE_23274,
		// Arceuus Essence Mine
		ROCKS_27984, ROCKS_27985, BOULDER_27990, ROCKS_27987, ROCKS_27988,
		// Wintertodt
		GAP_29326,
		// Gnome Stronghold Slayer Underground
		TUNNEL_30174, TUNNEL_30175,
		// Taverly Underground
		OBSTACLE_PIPE_16509, STRANGE_FLOOR, ROCKS, ROCKS_14106, LOOSE_RAILING_28849,
		// Heroes Guild
		CREVICE_9739, CREVICE_9740,
		// Fossil Island
		HOLE_31481, HOLE_31482, LADDER_30938, LADDER_30939, LADDER_30940, LADDER_30941, ROPE_ANCHOR, ROPE_ANCHOR_30917,
		RUBBER_CAP_MUSHROOM,
		ROCKS_31757, ROCKS_31758, ROCKS_31759, PILLAR_31809,
		// West Brimhaven
		ROPESWING_23568, ROPESWING_23569,
		// Brimhaven Dungeon
		VINE_26880, VINE_26882, PIPE_21728, STEPPING_STONE_19040, PIPE_21727, LOG_BALANCE_20882, LOG_BALANCE_20884,
		STEPPING_STONE_21738, STEPPING_STONE_21739, TIGHTGAP,
		// Lumbridge
		STILE_12982,
		// Edgeville Dungeon
		MONKEYBARS_23566, OBSTACLE_PIPE_16511,
		// Miscellania
		STEPPING_STONE_11768,
		// Kalphite
		CREVICE_16465,
		// Eagles' Peak
		ROCKS_19849,
		// Catherby
		CROSSBOW_TREE_17062, ROCKS_17042,
		// Cairn Isle
		ROCKS_2231,
		// South Kourend
		STEPPING_STONE_29728, STEPPING_STONE_29729, STEPPING_STONE_29730,
		// Cosmic Temple
		JUTTING_WALL_17002,
		// Arandar
		ROCKS_16514, ROCKS_16515, LOG_BALANCE_3933,
		// South River Salve
		STEPPING_STONE_13504,
		DARK_TUNNEL_10047,
		// Ectofuntus
		WEATHERED_WALL, WEATHERED_WALL_16526,
		// Mos Le'Harmless
		STEPPING_STONE_19042,
		// North River Salve
		ROCKS_16998, ROCKS_16999,
		// West Zul-Andra
		STEPPING_STONE_10663,
		// Yanille Agility Dungeon
		BALANCING_LEDGE_23548, OBSTACLE_PIPE_23140, MONKEYBARS_23567, PILE_OF_RUBBLE_23563, PILE_OF_RUBBLE_23564,
		// High Level Wilderness Dungeon
		CREVICE_19043,
		// Revenant Caves
		PILLAR_31561
	);

	public static final Set<Integer> TRAP_OBSTACLE_IDS = Sets.newHashSet(
		// Agility pyramid
		NULL_3550, NULL_10872, NULL_10873
	);
}
