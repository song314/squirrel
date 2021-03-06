package org.squirrelframework.foundation.fsm;

/**
 * State machine which does not include environmental context during state transition.
 * @author Henry.He
 *
 * @param <T> type of State Machine
 * @param <S> type of State
 * @param <E> type of Event
 */
@Deprecated
public interface StateMachineWithoutContext<T extends StateMachineWithoutContext<T, S, E>, S, E> extends StateMachine<T, S, E, Void> {
}
