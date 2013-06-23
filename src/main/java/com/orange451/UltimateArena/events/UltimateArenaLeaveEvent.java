package com.orange451.UltimateArena.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import com.orange451.UltimateArena.Arenas.Arena;
import com.orange451.UltimateArena.Arenas.Objects.ArenaPlayer;

public class UltimateArenaLeaveEvent extends Event
{
	private static final HandlerList handlers = new HandlerList();
	
	private final ArenaPlayer arenaPlayer;
	private final Arena arena;
	
	/**
	 * Called when a player leaves an arena
	 * @param arenaPlayer - The ArenaPlayer that left
	 * @param arena - The Arena the player left
	 */
	public UltimateArenaLeaveEvent(final ArenaPlayer arenaPlayer, final Arena arena)
	{
		this.arenaPlayer = arenaPlayer;
		this.arena = arena;
	}
	
	public ArenaPlayer getArenaPlayer()
	{
		return arenaPlayer;
	}
	
	public Arena getArena()
	{
		return arena;
	}
	
	public String getArenaType()
	{
		return arena.type;
	}
	
	public Player getPlayer()
	{
		return arenaPlayer.player;
	}
	
	public boolean onWinningTeam()
	{
		return arenaPlayer.team == arena.winningTeam;
	}

	@Override
	public HandlerList getHandlers()
	{
		return handlers;
	}
}