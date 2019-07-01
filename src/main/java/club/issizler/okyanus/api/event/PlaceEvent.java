package club.issizler.okyanus.api.event;

/**
 * This event fires whenever a block has been placed by a player
 */
public interface PlaceEvent extends PlayerEvent, Cancellable, Locatable {
}
