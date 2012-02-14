package org.wso2.carbonstudio.eclipse.gmf.esb.diagram.custom.configure;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.wso2.carbonstudio.eclipse.gmf.esb.CloneMediator;
import org.wso2.carbonstudio.eclipse.gmf.esb.CloneMediatorTargetOutputConnector;
import org.wso2.carbonstudio.eclipse.gmf.esb.EsbFactory;
import org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage;

public class AddBranchCloneMediatorAction extends ConfigureEsbNodeAction {

	public AddBranchCloneMediatorAction(IWorkbenchPart part) {
		super(part);
		setId("add-branch-clone-mediator-action-id");
		setText("Add a branch");
		setToolTipText("Add a branch to clone-mediator.");
		ISharedImages workbenchImages = PlatformUI.getWorkbench().getSharedImages();		
		setImageDescriptor(workbenchImages.getImageDescriptor(ISharedImages.IMG_OBJ_ADD));
	}

	
	protected void doRun(IProgressMonitor progressMonitor) {
		EditPart selectedEP = getSelectedEditPart();
		Assert.isNotNull(selectedEP, "Empty selection.");
		
		EObject selectedObj = ((View) selectedEP.getModel()).getElement();
		Assert.isTrue(selectedObj instanceof CloneMediator, "Invalid selection.");

		CloneMediator parentMediator = (CloneMediator) selectedObj;
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(parentMediator);
		CloneMediatorTargetOutputConnector cb = EsbFactory.eINSTANCE.createCloneMediatorTargetOutputConnector();
		AddCommand addCmd = new AddCommand(domain,parentMediator,EsbPackage.Literals.CLONE_MEDIATOR__TARGETS_OUTPUT_CONNECTOR, cb);
		if (addCmd.canExecute()){
			domain.getCommandStack().execute(addCmd);
		} else {
			System.out.println("Cannot Execute the command");
		}
		
	}

}
