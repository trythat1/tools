package org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.tools.SelectionTool;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.carbonstudio.eclipse.gmf.esb.Sequence;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.policies.EsbServerContentsCompartmentCanonicalEditPolicy;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.policies.EsbServerContentsCompartmentItemSemanticEditPolicy;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.part.Messages;
import org.wso2.carbonstudio.eclipse.gmf.esb.persistence.SequenceInfo;

/**
 * @generated
 */
public class EsbServerContentsCompartmentEditPart extends
		ShapeCompartmentEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 7001;

	/**
	 * @generated
	 */
	public EsbServerContentsCompartmentEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	public String getCompartmentName() {
		return Messages.EsbServerContentsCompartmentEditPart_title;
	}

	/**
	 * @generated NOT
	 */
	public IFigure createFigure() {
		ResizableCompartmentFigure result = (ResizableCompartmentFigure) super
				.createFigure();
		result.setTitleVisibility(false);
		// Override default border.
		// result.setBorder(new MarginBorder(0, 0, 0, 0));
		result.setToolTip((String) null);

		return result;
	}

	/**
	 * @generated NOT
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new EsbServerContentsCompartmentItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicy());
		// installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
		// new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new EsbServerContentsCompartmentCanonicalEditPolicy());
	}

	/**
	 * @generated
	 */
	protected void setRatio(Double ratio) {
		if (getFigure().getParent().getLayoutManager() instanceof ConstrainedToolbarLayout) {
			super.setRatio(ratio);
		}
	}

	public boolean isSelectable() {
		// TODO This or using ResizableEditpolicy?
		return false;
	}

	// when user drop the user defined Sequence mediator to the Compartment this
	// method will set the name of it.
	protected EditPart createChild(Object model) {
		if (!getEditDomain().getPaletteViewer().getActiveTool().getLabel()
				.equals(SequenceInfo.SEQUENCE_LABEL)
				& !getEditDomain().getPaletteViewer().getActiveTool()
						.getLabel().equals(SequenceInfo.SELECT)) {
			// Resource diagram;
			// if(((Sequence)((org.eclipse.gmf.runtime.notation.impl.NodeImpl)model).getElement()).getName().equals("")){

			String name = getEditDomain().getPaletteViewer().getActiveTool()
					.getLabel();

			/*
			 * EditPart editPart=super.createChild(model); if(editPart
			 * instanceof SequenceEditPart){
			 * 
			 * diagram = EsbDiagramEditorUtil.createDiagram(
			 * URI.createURI("platform:/resource/testing/"
			 * +name+".sequence_diagram"),
			 * URI.createURI("platform:/resource/testing/" +name+".sequence"),
			 * new NullProgressMonitor()); }
			 */
			if (((org.eclipse.gmf.runtime.notation.impl.NodeImpl) model)
					.getElement() instanceof Sequence) {
				Sequence sequence = (Sequence) ((org.eclipse.gmf.runtime.notation.impl.NodeImpl) model)
						.getElement();
				TransactionalEditingDomain editingDomain = getEditingDomain();
				SetRequest setRequest = new SetRequest(editingDomain, sequence,
						EsbPackage.eINSTANCE.getSequence_Name(), name);
				SetValueCommand operation = new SetValueCommand(setRequest) {

					public boolean canUndo() {
						return true;
					}

					public boolean canRedo() {
						return true;
					}
				};

				ICommandProxy command = new ICommandProxy(operation);
				if (command.canExecute()) {
					getEditDomain().getCommandStack().execute(command);
				}
				((org.eclipse.gmf.runtime.notation.impl.NodeImpl) model)
						.getChildren().size();

			}
		}
		return super.createChild(model);
	}

}
