package club.issizler.okyanus.api.event;

/**
 * This event fires whenever a block has been broken by a player
 */
public interface BreakEvent extends PlayerEvent, Cancellable, Locateable {
}
