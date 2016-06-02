/*
 * generated by Xtext 2.10.0
 */
package nl.tue.glt.xtext.serializer;

import boundingbox.BoundingboxPackage;
import boundingbox.MoveDown;
import boundingbox.MoveLeft;
import boundingbox.MoveRight;
import boundingbox.MoveUp;
import boundingbox.World;
import com.google.inject.Inject;
import java.util.Set;
import nl.tue.glt.xtext.services.BoundingBoxGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class BoundingBoxSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private BoundingBoxGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == BoundingboxPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case BoundingboxPackage.MOVE_DOWN:
				if (rule == grammarAccess.getMoveDownRule()) {
					sequence_MoveDown(context, (MoveDown) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getMoveRule()) {
					sequence_Move_MoveDown(context, (MoveDown) semanticObject); 
					return; 
				}
				else break;
			case BoundingboxPackage.MOVE_LEFT:
				if (rule == grammarAccess.getMoveLeftRule()) {
					sequence_MoveLeft(context, (MoveLeft) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getMoveRule()) {
					sequence_Move_MoveLeft(context, (MoveLeft) semanticObject); 
					return; 
				}
				else break;
			case BoundingboxPackage.MOVE_RIGHT:
				if (rule == grammarAccess.getMoveRightRule()) {
					sequence_MoveRight(context, (MoveRight) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getMoveRule()) {
					sequence_Move_MoveRight(context, (MoveRight) semanticObject); 
					return; 
				}
				else break;
			case BoundingboxPackage.MOVE_UP:
				if (rule == grammarAccess.getMoveUpRule()) {
					sequence_MoveUp(context, (MoveUp) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getMoveRule()) {
					sequence_Move_MoveUp(context, (MoveUp) semanticObject); 
					return; 
				}
				else break;
			case BoundingboxPackage.WORLD:
				sequence_World(context, (World) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     MoveDown returns MoveDown
	 *
	 * Constraint:
	 *     {MoveDown}
	 */
	protected void sequence_MoveDown(ISerializationContext context, MoveDown semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MoveLeft returns MoveLeft
	 *
	 * Constraint:
	 *     {MoveLeft}
	 */
	protected void sequence_MoveLeft(ISerializationContext context, MoveLeft semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MoveRight returns MoveRight
	 *
	 * Constraint:
	 *     {MoveRight}
	 */
	protected void sequence_MoveRight(ISerializationContext context, MoveRight semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MoveUp returns MoveUp
	 *
	 * Constraint:
	 *     {MoveUp}
	 */
	protected void sequence_MoveUp(ISerializationContext context, MoveUp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Move returns MoveDown
	 *
	 * Constraint:
	 *     distance=EInt
	 */
	protected void sequence_Move_MoveDown(ISerializationContext context, MoveDown semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BoundingboxPackage.Literals.MOVE__DISTANCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BoundingboxPackage.Literals.MOVE__DISTANCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMoveAccess().getDistanceEIntParserRuleCall_1_0(), semanticObject.getDistance());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Move returns MoveLeft
	 *
	 * Constraint:
	 *     distance=EInt
	 */
	protected void sequence_Move_MoveLeft(ISerializationContext context, MoveLeft semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BoundingboxPackage.Literals.MOVE__DISTANCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BoundingboxPackage.Literals.MOVE__DISTANCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMoveAccess().getDistanceEIntParserRuleCall_1_0(), semanticObject.getDistance());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Move returns MoveRight
	 *
	 * Constraint:
	 *     distance=EInt
	 */
	protected void sequence_Move_MoveRight(ISerializationContext context, MoveRight semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BoundingboxPackage.Literals.MOVE__DISTANCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BoundingboxPackage.Literals.MOVE__DISTANCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMoveAccess().getDistanceEIntParserRuleCall_1_0(), semanticObject.getDistance());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Move returns MoveUp
	 *
	 * Constraint:
	 *     distance=EInt
	 */
	protected void sequence_Move_MoveUp(ISerializationContext context, MoveUp semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BoundingboxPackage.Literals.MOVE__DISTANCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BoundingboxPackage.Literals.MOVE__DISTANCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMoveAccess().getDistanceEIntParserRuleCall_1_0(), semanticObject.getDistance());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     World returns World
	 *
	 * Constraint:
	 *     moveCommands+=Move+
	 */
	protected void sequence_World(ISerializationContext context, World semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
