package club.issizler.okyanus.api.event;

/**
 * This event fires whenever a block has been interacted by a player
 */
public interface InteractBlockEvent extends PlayerEvent, Cancellable, Locatable {
}
